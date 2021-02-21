// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param projectId Project ID in Upsource
 * @param discussionId If the reaction corresponds to a comment, ID of the discussion containing that comment
 * @param commentId If the reaction corresponds to a comment, ID of that comment
 * @param revisionId If the reaction corresponds to a revision, ID of that revision
 * @param reviewId If the reaction corresponds to a review, ID of that review
 */
@Suppress("unused")
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
	@Suppress("unused")
	internal constructor() : this(
		projectId = "",
		discussionId = null,
		commentId = null,
		revisionId = null,
		reviewId = null
	)
}
