package domian.board.dto.request

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size
import java.time.LocalDateTime

data class UpdateBoardRequest (

    @field:NotBlank(message = "제목을 작성해주세요.")
    @field:Size(min = 1, max = 500, message = "글자수는 500자를 초과할 수 없습니다.")
    val title: String,

    @field:NotBlank(message = "내용을 작성해주세요.")
    @field:Size(min = 1, max = 500, message = "글자수는 5000자를 초과할 수 없습니다.")
    val context: String,

    val createAt: LocalDateTime,
    val lastModifiedAt: LocalDateTime,
)