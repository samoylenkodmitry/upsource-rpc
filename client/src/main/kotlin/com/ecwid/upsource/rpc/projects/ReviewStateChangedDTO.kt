// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

data class ReviewStateChangedDTO(
	/**
	 * See ReviewStateEnum parameters (required)
	 */
	val oldState: ReviewStateEnum,

	/**
	 * See ReviewStateEnum parameters (required)
	 */
	val newState: ReviewStateEnum
) {
	internal constructor() : this(
		oldState = ReviewStateEnum.OPEN,
		newState = ReviewStateEnum.OPEN
	)
}
