package com.ecwid.upsource.rpc.analytics

data class LabelStats(
	/**
	 * Discussion label. See LabelDTO parameters (required)
	 */
	val label: com.ecwid.upsource.rpc.projects.LabelDTO,

	/**
	 * See UserValue parameters (repeated)
	 */
	val countsPerUser: List<UserValue> = emptyList()
) {
	internal constructor() : this(
		label = com.ecwid.upsource.rpc.projects.LabelDTO(),
		countsPerUser = emptyList()
	)
}
