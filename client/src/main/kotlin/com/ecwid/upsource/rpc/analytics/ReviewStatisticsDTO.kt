package com.ecwid.upsource.rpc.analytics

data class ReviewStatisticsDTO(
	/**
	 * Number of open reviews (required)
	 */
	val openReviews: Int,

	/**
	 * Number of closed reviews (required)
	 */
	val closedReviews: Int,

	/**
	 * Number of revisions covered by reviews (required)
	 */
	val allRevisions: Int,

	/**
	 * Number of revisions covered by open reviews (required)
	 */
	val revisionsCoveredByOpenReviews: Int,

	/**
	 * Number of revisions covered by closed reviews (required)
	 */
	val revisionsCoveredByClosedReviews: Int,

	/**
	 * Review counts per author (repeated)
	 */
	val authorStatsByReviews: List<UserValue> = emptyList(),

	/**
	 * Review counts per reviewer (repeated)
	 */
	val reviewerStatsByReviews: List<UserValue> = emptyList(),

	/**
	 * Review revisions counts per author (repeated)
	 */
	val authorStatsByRevisions: List<UserValue> = emptyList(),

	/**
	 * Review revisions counts per reviewer (repeated)
	 */
	val reviewerStatsByRevisions: List<UserValue> = emptyList(),

	/**
	 * Discussion comments statistics. See CommentsStatisticsDTO parameters (required)
	 */
	val commentsStats: CommentsStatisticsDTO
) {
	internal constructor() : this(
		openReviews = 0,
		closedReviews = 0,
		allRevisions = 0,
		revisionsCoveredByOpenReviews = 0,
		revisionsCoveredByClosedReviews = 0,
		authorStatsByReviews = emptyList(),
		reviewerStatsByReviews = emptyList(),
		authorStatsByRevisions = emptyList(),
		reviewerStatsByRevisions = emptyList(),
		commentsStats = CommentsStatisticsDTO()
	)
}
