package com.ecwid.upsource.rpc.projects

data class DiscussionInFeedDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Discussion ID (required)
	 */
	val discussionId: String,

	/**
	 * See AnchorDTO parameters (required)
	 */
	val anchor: AnchorDTO,

	/**
	 * See CommentDTO parameters (repeated)
	 */
	val comments: List<CommentDTO> = emptyList(),

	/**
	 * See ShortReviewInfoDTO parameters (optional)
	 */
	val review: ShortReviewInfoDTO? = null,

	/**
	 * Discussion labels. See LabelDTO parameters (repeated)
	 */
	val labels: List<LabelDTO> = emptyList(),

	/**
	 * Whether a discussion has been read by the requester (optional)
	 */
	val read: ReadEnum? = null,

	/**
	 * Whether a discussion has been starred by the requester (optional)
	 */
	val isStarred: Boolean? = null,

	/**
	 * An ID of the first unread comment (optional)
	 */
	val firstUnreadCommentId: String? = null,

	/**
	 * An ID of the issue linked to the discussion (optional)
	 */
	val issue: String? = null,

	/**
	 * Whether the discussion is resolved (optional)
	 */
	val isResolved: Boolean? = null,

	/**
	 * If the discussion is resolved, contains the ID of the user who resolved it (optional)
	 */
	val resolvedBy: String? = null
) {
	internal constructor() : this(
		projectId = "",
		discussionId = "",
		anchor = AnchorDTO(),
		comments = emptyList(),
		review = null,
		labels = emptyList(),
		read = null,
		isStarred = null,
		firstUnreadCommentId = null,
		issue = null,
		isResolved = null,
		resolvedBy = null
	)
}
