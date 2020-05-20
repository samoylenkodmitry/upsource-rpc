package com.ecwid.upsource.rpc.analytics

data class ProjectActivityDTO(
	/**
	 * See TimeValue parameters (repeated)
	 */
	val items: List<TimeValue> = emptyList(),

	/**
	 * Names of project modules (repeated)
	 */
	val modules: List<String> = emptyList(),

	/**
	 * See AnalyzerStats parameters (required)
	 */
	val stats: AnalyzerStats
) {
	internal constructor() : this(
		items = emptyList(),
		modules = emptyList(),
		stats = AnalyzerStats()
	)
}
