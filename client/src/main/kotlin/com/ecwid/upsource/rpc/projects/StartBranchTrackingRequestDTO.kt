package com.ecwid.upsource.rpc.projects

data class StartBranchTrackingRequestDTO(
	/**
	 * Review ID (required)
	 */
	val reviewId: com.ecwid.upsource.rpc.ids.ReviewIdDTO,

	/**
	 * Branch name to track (required)
	 */
	val branch: String
) {
	internal constructor() : this(
		reviewId = com.ecwid.upsource.rpc.ids.ReviewIdDTO(),
		branch = ""
	)
}
