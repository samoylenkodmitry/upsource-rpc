package com.ecwid.upsource.rpc.analytics

data class ModulesDistributionDTO(
	/**
	 * See ModuleTimeValue parameters (repeated)
	 */
	val items: List<ModuleTimeValue> = emptyList(),

	/**
	 * The specific time intervals that define the distribution (Unix timestamps) (repeated)
	 */
	val timePoints: List<Long> = emptyList(),

	/**
	 * Names of the project modules (repeated)
	 */
	val modules: List<String> = emptyList()
)