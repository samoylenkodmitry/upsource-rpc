package com.ecwid.upsource.rpc.projects

data class UpdateReviewLabelRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * See ReviewIdDTO parameters (optional)
	 */
	val reviewId: com.ecwid.upsource.rpc.ids.ReviewIdDTO? = null,

	/**
	 * Review label being added or removed. See LabelDTO parameters (required)
	 */
	val label: LabelDTO
) {
	internal constructor() : this(
		projectId = "",
		reviewId = null,
		label = LabelDTO()
	)
}
