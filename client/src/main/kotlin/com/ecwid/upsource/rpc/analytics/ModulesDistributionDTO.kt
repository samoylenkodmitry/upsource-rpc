// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.analytics

/**
 * @param items See ModuleTimeValue parameters
 * @param timePoints The specific time intervals that define the distribution (Unix timestamps)
 * @param modules Names of the project modules
 */
@Suppress("unused")
data class ModulesDistributionDTO(
	/**
	 * See ModuleTimeValue parameters (repeated)
	 * 
	 * @see com.ecwid.upsource.rpc.analytics.ModuleTimeValue
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