package domian.board.repository

import org.springframework.data.jpa.repository.JpaRepository

interface BoardRepository: JpaRepository<Board, String> {


}