package com.ecwid.upsource.rpc.projects

data class DiscussionInFileDTO(
	/**
	 * ID of the discussion (required)
	 */
	val discussionId: String,

	/**
	 * Current discussion anchor (required)
	 */
	val anchor: AnchorDTO,

	/**
	 * Original discussion anchor (optional)
	 */
	val origin: AnchorDTO? = null,

	/**
	 * See CommentDTO parameters (repeated)
	 */
	val comments: List<CommentDTO> = emptyList(),

	/**
	 * See ReadEnum parameters (optional)
	 */
	val read: ReadEnum? = null,

	/**
	 * Whether the discussion is starred (optional)
	 */
	val isStarred: Boolean? = null,

	/**
	 * See ShortReviewInfoDTO parameters (optional)
	 */
	val review: ShortReviewInfoDTO? = null,

	/**
	 * Discussion labels. See LabelDTO parameters (repeated)
	 */
	val labels: List<LabelDTO> = emptyList(),

	/**
	 * An ID of the issue linked to the discussion (optional)
	 */
	val issue: String? = null,

	/**
	 * Whether the discussion is resolved (optional)
	 */
	val isResolved: Boolean? = null,

	/**
	 * GitHub sync result. see SyncResultEnum parameters (optional)
	 */
	val syncResult: SyncResultEnum? = null
) {
	internal constructor() : this(
		discussionId = "",
		anchor = AnchorDTO(),
		origin = null,
		comments = emptyList(),
		read = null,
		isStarred = null,
		review = null,
		labels = emptyList(),
		issue = null,
		isResolved = null,
		syncResult = null
	)
}
