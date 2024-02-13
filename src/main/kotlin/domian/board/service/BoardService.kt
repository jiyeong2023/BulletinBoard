package domian.board.service

import domian.board.dto.response.BoardResponse
import domian.board.repository.BoardRepository
import org.springframework.stereotype.Service


@Service
class BoardService(
     private val boardRepository: BoardRepository
) {

    fun getAllBoardList(): List<BoardResponse>{
         return boardRepository.findAll().map { it.toResponse }
    }
}