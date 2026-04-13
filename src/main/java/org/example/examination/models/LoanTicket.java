package org.example.examination.models;

import java.time.LocalDate;
import java.util.List;
//Mỗi sách được mượn tối
//đa trong 7 ngày, nếu quá hạn sẽ bị phạt tiền 5.000 đồng/ngày. Nếu sách bị mất thì độc
//giả đó sẽ bị phạt số tiền tương ứng 200% giá sách.
public class LoanTicket {
    private String readerId;
    private LocalDate borrowDate;
    private LocalDate estimateReturnDate; //ngày trả dự kiến
    private LocalDate realityReturnDate; //ngày trả thực tế
    private List<String> bookISBNs; //danh sách các sách mượn

    public LoanTicket() {
    }

    public LoanTicket(String readerId, LocalDate borrowDate, LocalDate estimateReturnDate, LocalDate realityReturnDate, List<String> bookISBNs) {
        this.readerId = readerId;
        this.borrowDate = borrowDate;
        this.estimateReturnDate = estimateReturnDate;
        this.realityReturnDate = realityReturnDate;
        this.bookISBNs = bookISBNs;
    }

    public String getReaderId() {
        return readerId;
    }

    public void setReaderId(String readerId) {
        this.readerId = readerId;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public LocalDate getEstimateReturnDate() {
        return estimateReturnDate;
    }

    public void setEstimateReturnDate(LocalDate estimateReturnDate) {
        this.estimateReturnDate = estimateReturnDate;
    }

    public LocalDate getRealityReturnDate() {
        return realityReturnDate;
    }

    public void setRealityReturnDate(LocalDate realityReturnDate) {
        this.realityReturnDate = realityReturnDate;
    }

    public List<String> getBookISBNs() {
        return bookISBNs;
    }

    public void setBookISBNs(List<String> bookISBNs) {
        this.bookISBNs = bookISBNs;
    }
}
