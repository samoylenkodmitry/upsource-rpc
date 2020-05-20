package com.ecwid.upsource.rpc.analytics

data class TimeValue(
	/**
	 * Unix timestamp (required)
	 */
	val time: Long,

	/**
	 * The value associated with the timestamp (required)
	 */
	val value: Int
) {
	internal constructor() : this(
		time = 0L,
		value = 0
	)
}
