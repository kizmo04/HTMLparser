## Field options¶ Field types¶ Relationship fields¶ Field API reference¶ Attributes for fields¶ Attributes for fields with relations¶ Support Django! Contents Browse You are here: Getting help Download: Learn More Get Involved Follow Us
### null blank choices db_column db_index db_tablespace default editable error_messages help_text primary_key unique unique_for_date unique_for_month unique_for_year verbose_name validators AutoField BigAutoField BigIntegerField BinaryField BooleanField CharField CommaSeparatedIntegerField DateField DateTimeField DecimalField DurationField EmailField FileField FilePathField FloatField ImageField IntegerField GenericIPAddressField NullBooleanField PositiveIntegerField PositiveSmallIntegerField SlugField SmallIntegerField TextField TimeField URLField UUIDField ForeignKey ManyToManyField OneToOneField
#### null blank choices db_column db_index db_tablespace default editable error_messages help_text primary_key unique unique_for_date unique_for_month unique_for_year verbose_name validators AutoField BigAutoField BigIntegerField BinaryField BooleanField CharField max_length CommaSeparatedIntegerField DateField auto_now auto_now_add DateTimeField DecimalField max_digits decimal_places DurationField EmailField FileField upload_to storage FieldFile name size url open close save delete FilePathField path match recursive allow_files allow_folders FloatField ImageField height_field width_field IntegerField GenericIPAddressField protocol unpack_ipv4 NullBooleanField PositiveIntegerField PositiveSmallIntegerField SlugField allow_unicode SmallIntegerField TextField TimeField URLField UUIDField ForeignKey on_delete CASCADE PROTECT SET_NULL SET_DEFAULT SET DO_NOTHING limit_choices_to related_name related_query_name to_field db_constraint swappable ManyToManyField related_name related_query_name limit_choices_to symmetrical through through_fields db_table db_constraint swappable OneToOneField parent_link Field description get_internal_type db_type rel_db_type get_prep_value get_db_prep_value from_db_value get_db_prep_save pre_save to_python value_to_string formfield deconstruct auto_created concrete hidden is_relation model many_to_many many_to_one one_to_many one_to_one related_model