// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param from Starting line number
 * @param to Ending line number
 */
@Suppress("unused")
data class RangeMappingDTO(
	/**
	 * Starting line number (required)
	 */
	val from: com.ecwid.upsource.rpc.ids.RangeDTO,

	/**
	 * Ending line number (required)
	 */
	val to: com.ecwid.upsource.rpc.ids.RangeDTO
) {
	@Suppress("unused")
	internal constructor() : this(
		from = com.ecwid.upsource.rpc.ids.RangeDTO(),
		to = com.ecwid.upsource.rpc.ids.RangeDTO()
	)
}
