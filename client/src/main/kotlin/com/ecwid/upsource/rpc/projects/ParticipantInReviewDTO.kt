// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param userId Participant user ID
 * @param role Participant's role in the review. See RoleInReviewEnum parameters
 * @param state State of the participant. See ParticipantStateEnum parameters
 */
@Suppress("unused")
data class ParticipantInReviewDTO(
	/**
	 * Participant user ID (required)
	 */
	val userId: String,

	/**
	 * Participant's role in the review. See RoleInReviewEnum parameters (required)
	 *
	 * @see com.ecwid.upsource.rpc.users.RoleInReviewEnum
	 */
	val role: com.ecwid.upsource.rpc.users.RoleInReviewEnum,

	/**
	 * State of the participant. See ParticipantStateEnum parameters (optional)
	 *
	 * @see com.ecwid.upsource.rpc.projects.ParticipantStateEnum
	 */
	val state: ParticipantStateEnum? = null
) {
	@Suppress("unused")
	internal constructor() : this(
		userId = "",
		role = com.ecwid.upsource.rpc.users.RoleInReviewEnum.AUTHOR,
		state = null
	)
}

