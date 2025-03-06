package com.queiroz.library.catalog.domain;

import java.util.List;

public record PagedResult<T>(
        List<T> data,
        long totalElements,
        int pageNumber,
        int totalPages,
        boolean isFirst,
        boolean istLast,
        boolean hasNext,
        boolean hasPrevious) {}
