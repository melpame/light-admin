package org.lightadmin.config;

import org.lightadmin.core.config.annotation.Administration;
import org.lightadmin.core.config.domain.common.FieldSetConfigurationUnitBuilder;
import org.lightadmin.core.config.domain.common.PersistentFieldSetConfigurationUnitBuilder;
import org.lightadmin.core.config.domain.context.ScreenContextConfigurationUnit;
import org.lightadmin.core.config.domain.context.ScreenContextConfigurationUnitBuilder;
import org.lightadmin.core.config.domain.filter.FiltersConfigurationUnit;
import org.lightadmin.core.config.domain.filter.FiltersConfigurationUnitBuilder;
import org.lightadmin.core.config.domain.unit.FieldSetConfigurationUnit;
import org.lightadmin.test.model.FilterTestEntity;

@SuppressWarnings( "unused" )
@Administration( FilterTestEntity.class )
public class FilterTestEntityConfiguration {

	public static ScreenContextConfigurationUnit screenContext( final ScreenContextConfigurationUnitBuilder screenContextBuilder ) {
		return screenContextBuilder
				.screenName( "FilterTest Domain Administration" )
				.menuName( "FilterTest Domain" ).build();
	}

	public static FieldSetConfigurationUnit listView( final FieldSetConfigurationUnitBuilder listViewBuilder ) {
		return listViewBuilder
				.field( "textField" ).caption( "Text Field" )
				.field( "integerField" ).caption( "Integer Field" )
				.field( "primitiveIntegerField" ).caption( "Primitive Integer Field" )
				.field( "decimalField" ).caption( "Decimal Field" )
				.field( "booleanField" ).caption( "Boolean Field" ).build();
	}

	public static FieldSetConfigurationUnit showView( final FieldSetConfigurationUnitBuilder fragmentBuilder ) {
		return fragmentBuilder
				.field( "textField" ).caption( "Text Field" )
				.field( "integerField" ).caption( "Integer Field" )
				.field( "primitiveIntegerField" ).caption( "Primitive Integer Field" )
				.field( "decimalField" ).caption( "Decimal Field" )
				.field( "calculatedField" ).caption( "Calculated Field" )
				.field( "booleanField" ).caption( "Boolean Field" ).build();
	}

	public static FiltersConfigurationUnit filters( final FiltersConfigurationUnitBuilder filterBuilder ) {
		return filterBuilder
				.filter( "Id", "id" )
				.filter( "Text Field", "textField" )
				.filter( "Integer Field", "integerField" )
				.filter( "Primitive Integer Field", "primitiveIntegerField" )
				.filter( "Decimal Field", "decimalField" )
				.filter( "Boolean Field", "booleanField" ).build();
	}

	public static FieldSetConfigurationUnit formView( final PersistentFieldSetConfigurationUnitBuilder formViewBuilder ) {
		return formViewBuilder
				.field( "textField" ).caption( "Text Field" )
				.field( "integerField" ).caption( "Integer Field" )
				.field( "primitiveIntegerField" ).caption( "Primitive Integer Field" )
				.field( "decimalField" ).caption( "Decimal Field" )
				.field( "booleanField" ).caption( "Boolean Field" ).build();
	}
}
