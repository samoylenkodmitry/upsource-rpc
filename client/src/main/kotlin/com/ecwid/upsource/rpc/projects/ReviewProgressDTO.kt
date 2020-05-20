package com.ecwid.upsource.rpc.projects

data class ReviewProgressDTO(
	/**
	 * Individual progress for each participant (repeated)
	 */
	val participants: List<ParticipantProgressDTO> = emptyList(),

	/**
	 * Total number of files in review (required)
	 */
	val totalFiles: Int
) {
	internal constructor() : this(
		participants = emptyList(),
		totalFiles = 0
	)
}
