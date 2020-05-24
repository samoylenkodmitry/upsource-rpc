package com.ecwid.upsource.rpc.events

data class ReactionToggledEventBean(
	/**
	 * Discussion ID (required)
	 */
	val discussionId: String,

	/**
	 * Comment ID (required)
	 */
	val commentId: String,

	/**
	 * Reaction ID (required)
	 */
	val reactionId: String,

	/**
	 * Whether the reaction was added or removed (required)
	 */
	val wasAdded: Boolean,

	/**
	 * User who toggled reaction (required)
	 */
	val actor: UserIdBean
) {
	internal constructor() : this(
		discussionId = "",
		commentId = "",
		reactionId = "",
		wasAdded = false,
		actor = UserIdBean()
	)
}
