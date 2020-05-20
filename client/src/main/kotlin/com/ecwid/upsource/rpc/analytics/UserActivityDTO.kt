package com.ecwid.upsource.rpc.analytics

data class UserActivityDTO(
	/**
	 * See TimeValue parameters (repeated)
	 */
	val items: List<TimeValue> = emptyList(),

	/**
	 * See AnalyzerStats parameters (required)
	 */
	val stats: AnalyzerStats
) {
	internal constructor() : this(
		items = emptyList(),
		stats = AnalyzerStats()
	)
}
