package com.ecwid.upsource.rpc.projects

data class FeedDTO(
	/**
	 * See FeedItemDTO parameters (repeated)
	 */
	val feedItems: List<FeedItemDTO> = emptyList(),

	/**
	 * Whether all available items have been returned or more can be requested by passing the corresponding 'limit' value in the subsequent request (required)
	 */
	val hasMore: Boolean
) {
	internal constructor() : this(
		feedItems = emptyList(),
		hasMore = false
	)
}
