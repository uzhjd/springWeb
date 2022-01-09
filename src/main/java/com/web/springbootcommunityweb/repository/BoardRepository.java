package com.web.springbootcommunityweb.repository;

import com.web.springbootcommunityweb.domain.Board;
import com.web.springbootcommunityweb.domain.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
    Board findByUser(User user);
}