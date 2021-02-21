// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param reviewId See ReviewIdDTO parameters
 * @param groupId ID of a user group
 * @param role Role of users getting assigned. See RoleInReviewEnum parameters
 */
@Suppress("unused")
data class AddGroupToReviewRequestDTO(
	/**
	 * See ReviewIdDTO parameters (required)
	 * 
	 * @see com.ecwid.upsource.rpc.ids.ReviewIdDTO
	 */
	val reviewId: com.ecwid.upsource.rpc.ids.ReviewIdDTO,

	/**
	 * ID of a user group (required)
	 */
	val groupId: String,

	/**
	 * Role of users getting assigned. See RoleInReviewEnum parameters (required)
	 * 
	 * @see com.ecwid.upsource.rpc.users.RoleInReviewEnum
	 */
	val role: com.ecwid.upsource.rpc.users.RoleInReviewEnum
) {
	@Suppress("unused")
	internal constructor() : this(
		reviewId = com.ecwid.upsource.rpc.ids.ReviewIdDTO(),
		groupId = "",
		role = com.ecwid.upsource.rpc.users.RoleInReviewEnum.AUTHOR
	)
}
