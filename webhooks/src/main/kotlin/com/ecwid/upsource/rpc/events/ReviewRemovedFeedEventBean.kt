package com.ecwid.upsource.rpc.events

data class ReviewRemovedFeedEventBean(
	/**
	 * Base feed event (required)
	 */
	val base: FeedEventBean,

	/**
	 * Review ID (required)
	 */
	val reviewId: String
) {
	internal constructor() : this(
		base = FeedEventBean(),
		reviewId = ""
	)
}
