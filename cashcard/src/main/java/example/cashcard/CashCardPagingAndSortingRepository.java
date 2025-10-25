package example.cashcard;

import org.springframework.data.repository.PagingAndSortingRepository;

interface CashCardPagingAndSortingRepository extends PagingAndSortingRepository<CashCard, Long> {
    
}

