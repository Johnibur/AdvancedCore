package com.Ben12345rocks.AdvancedCore.Rewards.InjectedRequirement;

import org.bukkit.configuration.ConfigurationSection;

import com.Ben12345rocks.AdvancedCore.AdvancedCoreHook;
import com.Ben12345rocks.AdvancedCore.Rewards.Reward;
import com.Ben12345rocks.AdvancedCore.Rewards.RewardOptions;
import com.Ben12345rocks.AdvancedCore.UserManager.User;

import lombok.Getter;
import lombok.Setter;

public abstract class RequirementInjectInt extends RequirementInject {

	@Getter
	@Setter
	private int defaultValue = 0;

	public RequirementInjectInt(String path) {
		super(path);
	}

	public RequirementInjectInt(String path, int defaultValue) {
		super(path);
		this.defaultValue = defaultValue;
	}

	public abstract boolean onRequirementsRequest(Reward reward, User user, int num,
			RewardOptions rewardOptions);

	@Override
	public boolean onRequirementRequest(Reward reward, User user, ConfigurationSection data,
			RewardOptions rewardOptions) {
		if (data.isInt(getPath()) || (isAlwaysForce() && data.contains(getPath(), true))) {
			int value = data.getInt(getPath(), getDefaultValue());
			AdvancedCoreHook.getInstance()
					.extraDebug(reward.getRewardName() + ": Checking " + getPath() + ", value: " + value);
			return onRequirementsRequest(reward, user, value, rewardOptions);
		}
		return true;
	}

}
