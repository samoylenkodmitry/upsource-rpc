// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param reviewId See ReviewIdDTO parameters
 * @param revisions IDs of the requested revisions
 */
@Suppress("unused")
data class ReviewSummaryChangesRequestDTO(
	/**
	 * See ReviewIdDTO parameters (required)
	 * 
	 * @see com.ecwid.upsource.rpc.ids.ReviewIdDTO
	 */
	val reviewId: com.ecwid.upsource.rpc.ids.ReviewIdDTO,

	/**
	 * IDs of the requested revisions (optional)
	 */
	val revisions: RevisionsSetDTO? = null
) {
	@Suppress("unused")
	internal constructor() : this(
		reviewId = com.ecwid.upsource.rpc.ids.ReviewIdDTO(),
		revisions = null
	)
}
