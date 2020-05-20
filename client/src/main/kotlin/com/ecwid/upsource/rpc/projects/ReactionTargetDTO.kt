package com.ecwid.upsource.rpc.projects

data class ReactionTargetDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * If the reaction corresponds to a comment, ID of the discussion containing that comment (optional)
	 */
	val discussionId: String? = null,

	/**
	 * If the reaction corresponds to a comment, ID of that comment (optional)
	 */
	val commentId: String? = null,

	/**
	 * If the reaction corresponds to a revision, ID of that revision (optional)
	 */
	val revisionId: String? = null,

	/**
	 * If the reaction corresponds to a review, ID of that review (optional)
	 */
	val reviewId: String? = null
) {
	internal constructor() : this(
		projectId = "",
		discussionId = null,
		commentId = null,
		revisionId = null,
		reviewId = null
	)
}
