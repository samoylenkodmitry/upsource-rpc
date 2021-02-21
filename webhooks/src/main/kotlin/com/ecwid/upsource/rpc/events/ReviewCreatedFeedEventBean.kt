// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.events

/**
 * @param base Base feed event
 * @param revisions List of revisions that were added to review at time of creation
 * @param branch Name of the branch being tracked by the review
 */
@Suppress("unused")
data class ReviewCreatedFeedEventBean(
	/**
	 * Base feed event (required)
	 */
	val base: FeedEventBean,

	/**
	 * List of revisions that were added to review at time of creation (repeated)
	 */
	val revisions: List<String> = emptyList(),

	/**
	 * Name of the branch being tracked by the review (optional)
	 */
	val branch: String? = null
) {
	@Suppress("unused")
	internal constructor() : this(
		base = FeedEventBean(),
		revisions = emptyList(),
		branch = null
	)
}
