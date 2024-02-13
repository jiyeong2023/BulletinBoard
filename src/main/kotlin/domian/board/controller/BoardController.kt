package domian.board.controller

import domian.board.dto.request.CreateBoardRequest
import domian.board.dto.response.BoardResponse
import domian.board.service.BoardService
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RequestMapping("/borads")
@RestController
class BoardController(
 private val boardService: BoardService
)
{
   @GetMapping
   fun getBoardList(): ResponseEntity<List<BoardResponse>> {
       return ResponseEntity
           .status(HttpStatus.OK)
           .body(BoardService.getAllBoardList())
   }

    @GetMapping("/boads/{boardId}")
    fun getBoard(@PathVariable boardId: String): ResponseEntity<BoardResponse>{
         return ResponseEntity
             .status(HttpStatus.OK)
             .body(BoardService. getBoardById))
    }

    @PostMapping
    fun createBoard(
        @RequestBody @Valid request: CreateBoardRequest,
    ) : ResponseEntity<BoardResponse> {

        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(boardService.createBoard(userId, request)
    }

    @PutMapping
    fun
}

