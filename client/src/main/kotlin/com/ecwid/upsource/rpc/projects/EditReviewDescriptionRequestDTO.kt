// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

data class EditReviewDescriptionRequestDTO(
	/**
	 * See ReviewIdDTO parameters (required)
	 */
	val reviewId: com.ecwid.upsource.rpc.ids.ReviewIdDTO,

	/**
	 * Review description (Markdown is supported) (required)
	 */
	val text: String
) {
	internal constructor() : this(
		reviewId = com.ecwid.upsource.rpc.ids.ReviewIdDTO(),
		text = ""
	)
}
