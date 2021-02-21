// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param limit Number of news feed messages returned
 * @param type Feed type, see FeedTypeEnum for possible values
 * @param projectId Project ID in Upsource
 * @param reviewId Review ID
 * @param searchQuery Search query. Use '#my' to request the personal feed, or leave empty for the full feed
 * @param reviewFeedSort Review feed sorting ('Natural' by default)
 */
@Suppress("unused")
data class FeedRequestDTO(
	/**
	 * Number of news feed messages returned (required)
	 */
	val limit: Int,

	/**
	 * Feed type, see FeedTypeEnum for possible values (required)
	 */
	val type: FeedTypeEnum,

	/**
	 * Project ID in Upsource (optional)
	 */
	val projectId: String? = null,

	/**
	 * Review ID (optional)
	 */
	val reviewId: String? = null,

	/**
	 * Search query. Use '#my' to request the personal feed, or leave empty for the full feed (optional)
	 */
	val searchQuery: String? = null,

	/**
	 * Review feed sorting ('Natural' by default) (optional)
	 */
	val reviewFeedSort: ReviewFeedSortEnum? = null
) {
	@Suppress("unused")
	internal constructor() : this(
		limit = 0,
		type = FeedTypeEnum.FEED,
		projectId = null,
		reviewId = null,
		searchQuery = null,
		reviewFeedSort = null
	)
}
