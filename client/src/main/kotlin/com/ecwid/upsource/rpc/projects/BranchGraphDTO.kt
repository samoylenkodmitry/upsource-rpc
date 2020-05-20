package com.ecwid.upsource.rpc.projects

data class BranchGraphDTO(
	/**
	 * See RevisionInfoDTO parameters (repeated)
	 */
	val revisions: List<RevisionInfoDTO> = emptyList(),

	/**
	 * See RevisionListGraphDTO parameters (required)
	 */
	val graph: RevisionListGraphDTO
) {
	internal constructor() : this(
		revisions = emptyList(),
		graph = RevisionListGraphDTO()
	)
}
