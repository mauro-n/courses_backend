package com.udemyclone.app.shared.persistence;

import java.util.List;
import java.util.Optional;

public interface BaseRepository<T> {

    Optional<T> get(long id);

    List<T> list();

    T save(T t);
}
