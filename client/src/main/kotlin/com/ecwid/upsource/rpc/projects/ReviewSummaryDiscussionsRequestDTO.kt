package com.ecwid.upsource.rpc.projects

data class ReviewSummaryDiscussionsRequestDTO(
	/**
	 * See ReviewIdDTO parameters (required)
	 */
	val reviewId: com.ecwid.upsource.rpc.ids.ReviewIdDTO,

	/**
	 * See RevisionsSetDTO parameters (optional)
	 */
	val revisions: RevisionsSetDTO? = null
) {
	internal constructor() : this(
		reviewId = com.ecwid.upsource.rpc.ids.ReviewIdDTO(),
		revisions = null
	)
}
