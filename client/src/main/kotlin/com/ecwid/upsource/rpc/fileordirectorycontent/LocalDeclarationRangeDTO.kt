// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.fileordirectorycontent

data class LocalDeclarationRangeDTO(
	/**
	 * ID of the target element (required)
	 */
	val targetId: Int,

	/**
	 * Start offset (required)
	 */
	val startOffset: Int,

	/**
	 * End offset (required)
	 */
	val endOffset: Int
) {
	internal constructor() : this(
		targetId = 0,
		startOffset = 0,
		endOffset = 0
	)
}
