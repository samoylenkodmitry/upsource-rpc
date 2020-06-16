package com.ecwid.upsource.rpc.projects

data class UpdateParticipantInReviewResponseDTO(
	/**
	 * GitHub sync result. See SyncResultEnum parameters (optional)
	 */
	val syncResult: SyncResultEnum? = null
)