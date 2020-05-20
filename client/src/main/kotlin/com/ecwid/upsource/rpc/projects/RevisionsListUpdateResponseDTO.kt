package com.ecwid.upsource.rpc.projects

data class RevisionsListUpdateResponseDTO(
	/**
	 * See RevisionInfoDTO parameters (repeated)
	 */
	val revision: List<RevisionInfoDTO> = emptyList(),

	/**
	 * Current head revision ID (required)
	 */
	val hash: String
) {
	internal constructor() : this(
		revision = emptyList(),
		hash = ""
	)
}
