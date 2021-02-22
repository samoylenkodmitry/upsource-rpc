// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.events

/**
 * @param base Base feed event
 * @param reviewId Review ID
 */
@Suppress("unused")
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
	@Suppress("unused")
	internal constructor() : this(
		base = FeedEventBean(),
		reviewId = ""
	)
}

