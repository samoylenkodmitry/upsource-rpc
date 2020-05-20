package com.ecwid.upsource.rpc.analytics

data class ResponsibilityDistributionRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Unix timestamp (required)
	 */
	val fromTime: Long,

	/**
	 * Unix timestamp (required)
	 */
	val toTime: Long
) {
	internal constructor() : this(
		projectId = "",
		fromTime = 0L,
		toTime = 0L
	)
}
