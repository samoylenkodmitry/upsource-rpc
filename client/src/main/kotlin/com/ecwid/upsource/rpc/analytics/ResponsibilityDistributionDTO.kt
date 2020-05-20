package com.ecwid.upsource.rpc.analytics

data class ResponsibilityDistributionDTO(
	/**
	 * See CommitterModuleValue parameters (repeated)
	 */
	val items: List<CommitterModuleValue> = emptyList(),

	/**
	 * See CommitterUserInfo parameters (repeated)
	 */
	val users: List<CommitterUserInfo> = emptyList(),

	/**
	 * Names of the project modules (repeated)
	 */
	val modules: List<String> = emptyList(),

	/**
	 * See AnalyzerStats parameters (required)
	 */
	val stats: AnalyzerStats
) {
	internal constructor() : this(
		items = emptyList(),
		users = emptyList(),
		modules = emptyList(),
		stats = AnalyzerStats()
	)
}
