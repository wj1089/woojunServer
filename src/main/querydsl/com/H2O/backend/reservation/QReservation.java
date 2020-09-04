package com.H2O.backend.reservation;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReservation is a Querydsl query type for Reservation
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QReservation extends EntityPathBase<Reservation> {

    private static final long serialVersionUID = 1633172474L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReservation reservation = new QReservation("reservation");

    public final com.H2O.backend.ambulance.QAmbulance ambulance;

    public final StringPath date = createString("date");

    public final com.H2O.backend.doctor.QDoctor doctor;

    public final StringPath prescription = createString("prescription");

    public final StringPath price = createString("price");

    public final NumberPath<Long> reservationNo = createNumber("reservationNo", Long.class);

    public final StringPath reservationType = createString("reservationType");

    public final com.H2O.backend.user.QUser user;

    public QReservation(String variable) {
        this(Reservation.class, forVariable(variable), INITS);
    }

    public QReservation(Path<? extends Reservation> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReservation(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReservation(PathMetadata metadata, PathInits inits) {
        this(Reservation.class, metadata, inits);
    }

    public QReservation(Class<? extends Reservation> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.ambulance = inits.isInitialized("ambulance") ? new com.H2O.backend.ambulance.QAmbulance(forProperty("ambulance")) : null;
        this.doctor = inits.isInitialized("doctor") ? new com.H2O.backend.doctor.QDoctor(forProperty("doctor"), inits.get("doctor")) : null;
        this.user = inits.isInitialized("user") ? new com.H2O.backend.user.QUser(forProperty("user")) : null;
    }

}

