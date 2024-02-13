package domian.board.dto.response

import java.time.LocalDateTime

data class BoardResponse(
    val userId: String,
    val nickName: String,
    val role: String,
    val title: String,
    val context: String,
    val createAt: LocalDateTime,
    val lastModifiedAt: LocalDateTime,
)
