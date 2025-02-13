package org.parchmentmc.lodestone.converter;

import org.parchmentmc.feather.metadata.FieldMetadata;
import org.parchmentmc.feather.metadata.FieldMetadataBuilder;
import org.parchmentmc.feather.named.NamedBuilder;
import org.parchmentmc.lodestone.asm.MutableClassInfo;
import org.parchmentmc.lodestone.asm.MutableFieldInfo;

public class FieldConverter {

    /**
     * Converts the given MutableFieldInfo object into a FieldMetadata object for the specified class.
     *
     * @param classInfo the MutableClassInfo object representing the class that the field belongs to
     * @param fieldInfo the MutableFieldInfo object to convert
     * @return a FieldMetadata object representing the converted MutableFieldInfo object
     */
    public FieldMetadata convert(final MutableClassInfo classInfo, final MutableFieldInfo fieldInfo) {
        return FieldMetadataBuilder.create()
                .withName(NamedBuilder.create().withObfuscated(fieldInfo.getName()).build())
                .withDescriptor(NamedBuilder.create().withObfuscated(fieldInfo.getDesc()).build())
                .withSignature(NamedBuilder.create().withObfuscated(fieldInfo.getSignature()).build())
                .withSecuritySpecification(fieldInfo.getAccess())
                .withOwner(NamedBuilder.create().withObfuscated(classInfo.getName()).build())
                .build();
    }
}
