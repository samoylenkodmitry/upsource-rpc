// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param reviewId See ReviewIdDTO parameters
 * @param text New review title
 */
@Suppress("unused")
data class RenameReviewRequestDTO(
	/**
	 * See ReviewIdDTO parameters (required)
	 *
	 * @see com.ecwid.upsource.rpc.ids.ReviewIdDTO
	 */
	val reviewId: com.ecwid.upsource.rpc.ids.ReviewIdDTO,

	/**
	 * New review title (required)
	 */
	val text: String
) {
	@Suppress("unused")
	internal constructor() : this(
		reviewId = com.ecwid.upsource.rpc.ids.ReviewIdDTO(),
		text = ""
	)
}

