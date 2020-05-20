package com.ecwid.upsource.rpc.analytics

data class ContributorsDistributionDTO(
	/**
	 * See CommitterTimeValue parameters (repeated)
	 */
	val items: List<CommitterTimeValue> = emptyList(),

	/**
	 * The specific time intervals that define the distribution (repeated)
	 */
	val timePoints: List<Long> = emptyList(),

	/**
	 * See CommitterUserInfo parameters (repeated)
	 */
	val users: List<CommitterUserInfo> = emptyList()
)