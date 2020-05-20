package com.ecwid.upsource.rpc.projects

data class AddGroupToReviewRequestDTO(
	/**
	 * See ReviewIdDTO parameters (required)
	 */
	val reviewId: com.ecwid.upsource.rpc.ids.ReviewIdDTO,

	/**
	 * ID of a user group (required)
	 */
	val groupId: String,

	/**
	 * Role of users getting assigned. See RoleInReviewEnum parameters (required)
	 */
	val role: com.ecwid.upsource.rpc.users.RoleInReviewEnum
) {
	internal constructor() : this(
		reviewId = com.ecwid.upsource.rpc.ids.ReviewIdDTO(),
		groupId = "",
		role = com.ecwid.upsource.rpc.users.RoleInReviewEnum.AUTHOR
	)
}
