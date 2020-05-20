package com.ecwid.upsource.rpc.projects

data class LabelsListDTO(
	/**
	 * Indicates if predefined labels are hidden (required)
	 */
	val hidePredefinedLabels: Boolean,

	/**
	 * Predefined discussion labels. See LabelDTO parameters (repeated)
	 */
	val predefinedLabels: List<LabelDTO> = emptyList(),

	/**
	 * Custom discussion labels. See LabelDTO parameters (repeated)
	 */
	val customLabels: List<LabelDTO> = emptyList()
) {
	internal constructor() : this(
		hidePredefinedLabels = false,
		predefinedLabels = emptyList(),
		customLabels = emptyList()
	)
}
