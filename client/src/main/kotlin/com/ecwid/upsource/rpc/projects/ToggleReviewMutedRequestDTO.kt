package com.ecwid.upsource.rpc.projects

data class ToggleReviewMutedRequestDTO(
	/**
	 * See ReviewIdDTO parameters (required)
	 */
	val reviewId: com.ecwid.upsource.rpc.ids.ReviewIdDTO,

	/**
	 * Whether to mute or to unmute (required)
	 */
	val doMute: Boolean
) {
	internal constructor() : this(
		reviewId = com.ecwid.upsource.rpc.ids.ReviewIdDTO(),
		doMute = false
	)
}
