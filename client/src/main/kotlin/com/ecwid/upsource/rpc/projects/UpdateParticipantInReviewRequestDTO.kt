package com.ecwid.upsource.rpc.projects

data class UpdateParticipantInReviewRequestDTO(
	/**
	 * See ReviewIdDTO parameters (required)
	 */
	val reviewId: com.ecwid.upsource.rpc.ids.ReviewIdDTO,

	/**
	 * State of the participant. See ParticipantStateEnum parameters (required)
	 */
	val state: ParticipantStateEnum,

	/**
	 * User ID. When set, this user's participant state will be changed. (optional)
	 */
	val userId: String? = null
) {
	internal constructor() : this(
		reviewId = com.ecwid.upsource.rpc.ids.ReviewIdDTO(),
		state = ParticipantStateEnum.UNREAD,
		userId = null
	)
}
